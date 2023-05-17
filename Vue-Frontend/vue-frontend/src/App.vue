<template>
  <div id="app">
 <TodoItem /> 
 <HelloWorld/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import TodoItem from './components/TodoItem.vue';
export default {
  name: 'App',
  components: {
    HelloWorld,
    TodoItem
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
