import { createRouter, createWebHistory } from 'vue-router';
import TodoItem from './components/TodoItem.vue'
import AddItem from './components/AddItem.vue'
//const TodoItem = {template: '<div>TodoItem</div>'}
//const AddItem = {template: '<div>AddItem</div>'}

const routes = [
  {
    path: '/',
    component: TodoItem
  },
  {
    path: '/addItem',
    component: AddItem
  }

]
const router = createRouter({
  history: createWebHistory(),
  routes, 
})


  export default router