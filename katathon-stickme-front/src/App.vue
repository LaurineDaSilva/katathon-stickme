<script setup>
import Header from './components/Header.vue'
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <Header></Header>
    <div class="wrapper">

      <nav>
    <!--   <RouterLink to="/CreateForm">Home</RouterLink>--> 
      </nav>
    </div>
  </header>

  <RouterView />
</template>
