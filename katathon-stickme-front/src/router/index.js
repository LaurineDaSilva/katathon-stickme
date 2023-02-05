import { createRouter, createWebHistory } from 'vue-router'
import ViewAllStickers from '../components/ViewAllStickers.vue'
import CreateSticker from '../components/CreateSticker.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: ViewAllStickers
    },
    {
      path: '/create',
      name: 'create',
      component: CreateSticker
    },
  ]
})

export default router
