<template>
    <div class="container">
        <h1 class="text-center">List</h1>
        <table class="table table-striped">
            <thead>
                <th>ID</th>
                <th>title</th>
                <th>description</th>
            </thead>
            <tbody>
                <tr v-for="item in todoItems" v-bind:key="item.id">
                    <td>{{item.id}}</td>
                    <td>{{item.title}}</td>
                    <td>{{item.description}}</td>
                </tr>
            </tbody>
        </table>
        <button variant="primary">Add TodoItem</button>
    </div> 
</template>

<script>
import ServiceTodoItem from '@/services/ServiceTodoItem';

export default {
    name: "TodoItem", 
    data(){
        return {
            todoItems : []
        }
    },
    methods: {
        getTodoItems(){
            ServiceTodoItem.getTodoItems().then((response) =>{
                console.log(response)
                this.todoItems = response.data; 
              });
        }
    }, 
    created() {
        this.getTodoItems()
    },
    setup() {
        
    },
}
</script>


