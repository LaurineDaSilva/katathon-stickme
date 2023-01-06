import { createRouter, createWebHistory } from 'vue-router'
import CreateSticker from '../components/CreateSticker.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: CreateSticker
    },
  ]
})

export default router
