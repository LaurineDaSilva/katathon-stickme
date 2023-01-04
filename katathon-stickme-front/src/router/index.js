import { createRouter, createWebHistory } from 'vue-router'
import CreateForm from '../components/CreateForm.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: CreateForm
    },
  ]
})

export default router
