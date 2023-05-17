import axios from "axios";

const TODO_API_BASE_URL = "http://localhost:8080/todo/";

class ServiceTodoItem{
    getTodoItems(){
        return axios.get(TODO_API_BASE_URL);
    }
}
export default new ServiceTodoItem()