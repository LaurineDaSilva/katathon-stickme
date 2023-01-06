<script>
    import { useVuelidate } from '@vuelidate/core'
    import { required } from '@vuelidate/validators'

    export default {

        setup() {
        return { v$: useVuelidate() }
        },

        data() {
            return {
                labels : {
                    message: 'Create a sticker',
                    name: 'Name',
                    imageUrl: 'Image URL',
                    description: 'Description',
                    sizeId: 'Size',
                    aspectId: 'Aspect',
                    price: 'Price',
                    submit: 'Create',
                    toastTitle: 'StickMe',
                    toastMessage: 'Sticker created with success.'
                },
                form: { //data model
                    name: '',
                    imageUrl: '',
                    description: '',
                    sizeId: '',
                    aspectId: '',
                    price: ''
                }
                
            };
        },

        validations() {
            return {
                form: {
                    name: {
                        required,
                    },
                    imageUrl: {
                        required
                    },
                    description: {
                        required
                    },
                    sizeId: {
                        required
                    },
                    aspectId: {
                        required
                    },
                    price: {
                        required
                    }
                },
            }
        },

        methods: {
            async handleSubmit() {

                    
                    
                    // *******validation form*******
                    
                    //Returns a Promise with a boolean, which resolves once all validators finish.
                    
                    const valid = await this.v$.$validate(); 
                    if (valid) {
                        //*******create toast and reset form******
                    const form = document.querySelector("form");
                    const toastLive = document.getElementById('liveToast');
                    const toast = new bootstrap.Toast(toastLive)
                    toast.show()
                    form.reset();

                    //*******send data to database******
                    const dataJson = JSON.stringify(this.form);
                    console.log(dataJson);

                    fetch("http://localhost:8080/stickers", { method: "POST", headers: {"Content-Type": "application/json"}, body: dataJson});
                    } 
                }
                
            }, 
        }  
            // touch() => a property on each Vuelidate object/property that allows us to individually validate a value. 
            // validate() => will validate all of the inputs and, like touch, update the Vuelidate objects
        
    
        

    
</script>

<template>
    <h1>{{ labels.message }}</h1>
    <form @submit.prevent="handleSubmit" class="row g-3" id="form">
                <div class="row">
                    <div class="col-md-6">
                        <label for="name" class="form-label">{{ labels.name }}</label>
                        <input type="text" v-model="form.name" :class="{'is-invalid' : v$.form.name.$error}" class="form-control user-input" id="name" />
                    </div>

                    <div class="col-md-6">
                        <label for="imageUrl" class="form-label">{{ labels.imageUrl }}</label>
                        <input type="text" v-model="form.imageUrl" :class="{'is-invalid' : v$.form.imageUrl.$error}" class="form-control user-input" id="imageUrl" />
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <label for="description" class="form-label">{{ labels.description }} </label>
                        <textarea v-model="form.description" :class="{'is-invalid' : v$.form.description.$error}" class="form-control user-input" id="description" rows="4" ></textarea>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4">
                        <label for="sizeId" class="form-label">{{ labels.sizeId }}</label>
                        <select v-model="form.sizeId" :class="{'is-invalid' : v$.form.sizeId.$error}" class="form-select user-input" id="sizeId" >
                            <option value="" selected></option>
                            <option value="1">Small</option>
                            <option value="2">Medium</option>
                            <option value="3">Big</option>
                        </select>
                    </div>
                
                    <div class="col-md-4">
                        <label for="aspectId" class="form-label">{{ labels.aspectId }}</label>
                        <select v-model="form.aspectId" :class="{'is-invalid' : v$.form.aspectId.$error}" class="form-select user-input" id="aspectId" >
                            <option value="" selected></option>
                            <option value="1">Matte</option>
                            <option value="2">Glossy</option>
                        </select>
                    </div>

                    <div class="col-md-4">
                        <label for="price" class="form-label">{{ labels.price }}</label>
                        <div class="input-group">
                            <span class="input-group-text">€</span>
                            <input type="number" v-model="form.price" :class="{'is-invalid' : v$.form.price.$error}" class="form-control user-input" id="price"  />
                        </div>
                    </div>
                </div>
                
            <div class="row">
                <div class="d-grid gap-2 d-md-flex justify-content-md-end margin">
                    <button type="submit" class="btn btn-primary" id="submit-button">{{ labels.submit }}</button>
                </div>
            </div>

            <div class="toast-container position-fixed bottom-0 end-0 p-3">
                <div id="liveToast" class="toast" role="alert" aria-live="assertive" aria-atomic="true">
                    <div class="toast-header">
                        <strong class="me-auto"> {{ labels.toastTitle }}</strong>
                        <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
                    </div>
                    <div class="toast-body">
                        {{ labels.toastMessage }}
                    </div>
                </div>
            </div>
        </form>
</template>