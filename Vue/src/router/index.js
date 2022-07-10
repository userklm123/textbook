import Vue from "vue";
import Router from "vue-router";
import home from "../page/home";
import adminHome from "../page/adminHome";


Vue.use(Router);

export default new Router({
	mode: "history",
	routes: [
	{
		  path:'/',
		  name:'home',
		  component:home
	},
	{
		  path:'/adminHome',
		  name:'adminHome',
		  component:adminHome
	},]
});