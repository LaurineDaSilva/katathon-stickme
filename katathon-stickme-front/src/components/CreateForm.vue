<script>
    import { useVuelidate } from '@vuelidate/core'
    import { required } from '@vuelidate/validators'

    export default {
        setup () {
        return { v$: useVuelidate() }
        },
        data() {
            return {
                labels : {
                    message: 'Create a sticker',
                    name: 'Name',
                    image: 'Image URL',
                    description: 'Description',
                    size: 'Size',
                    aspect: 'Aspect',
                    price: 'Price',
                    submit: 'Create',
                    toastTitle: 'StickMe',
                    toastMessage: 'Sticker created with success.'
                },
                form: {
                    name: '',
                    image: '',
                    description: '',
                    size: '',
                    aspect: '',
                    price: ''
                },
                submitted: false 
            };
        },

        validations() {
            return {
                form: {
                    name: {
                        required,
                    },
                    image: {
                        required
                    },
                    description: {
                        required
                    },
                    size: {
                        required
                    },
                    aspect: {
                        required
                    },
                    price: {
                        required
                    }
                },
            }
        },

        methods: {
            submit() {
                const form = document.querySelector("form");
                form.addEventListener("submit", (event) => {
                    event.preventDefault();
                    form.reset();
                    const toastLiveExample = document.getElementById('liveToast');
                    const toast = new bootstrap.Toast(toastLiveExample)
                    toast.show()
                })
            }, 
            handleSubmit(e) {
                

                this.submitted = true;

                this.$v.$validate(); //$touch();
                if (this.$v.$invalid) {
                    return
                }
                console.log("ok");
            }    
            // touch() => a property on each Vuelidate object/property that allows us to individually validate a value. 
            //validate() => will validate all of the inputs and, like touch, update the Vuelidate objects
       
            }
        }
    
        

    
</script>

<template>
    <h1>{{ labels.message }}</h1>
    <form @submit.prevent="handleSubmit" class="row g-3" id="form">
                <div class="row">
                    <div class="col-md-6">
                        <label for="name" class="form-label">{{ labels.name }}</label>
                        <input type="text" v-model="form.name" class="form-control user-input" id="name" required minlength="1" maxlength="100"/>
                    </div>

                    <div class="col-md-6">
                        <label for="image" class="form-label">{{ labels.image }}</label>
                        <input type="text" v-model="form.image" class="form-control user-input" id="image" required minlength="1" maxlength="300"/>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <label for="description" class="form-label">{{ labels.description }} </label>
                        <textarea v-model="form.description" class="form-control user-input" id="description" rows="4" required minlength="1" maxlength="1000"></textarea>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4">
                        <label for="size" class="form-label">{{ labels.size }}</label>
                        <select v-model="form.size" class="form-select user-input" id="size" required>
                            <option value="" selected></option>
                            <option value="1">Small</option>
                            <option value="2">Medium</option>
                            <option value="3">Big</option>
                        </select>
                    </div>
                
                    <div class="col-md-4">
                        <label for="aspect" class="form-label">{{ labels.aspect }}</label>
                        <select v-model="form.aspect" class="form-select user-input" id="aspect" required>
                            <option value="" selected></option>
                            <option value="1">Matte</option>
                            <option value="2">Glossy</option>
                        </select>
                    </div>

                    <div class="col-md-4">
                        <label for="price" class="form-label">{{ labels.price }}</label>
                        <div class="input-group">
                            <span class="input-group-text">€</span>
                            <input type="number" v-model="form.price" class="form-control user-input" id="price" required step="0.01" min="1" max="100.00"/>
                        </div>
                    </div>
                </div>
                
            <div class="row">
                <div class="d-grid gap-2 d-md-flex justify-content-md-end margin">
                    <button @click="submit" type="submit" class="btn btn-primary" id="submit-button">{{ labels.submit }}</button>
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