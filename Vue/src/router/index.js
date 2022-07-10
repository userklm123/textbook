import Vue from "vue";
import Router from "vue-router";
import home from "../page/home";
import adminHome from "../page/adminHome";
import studentHome from "../page/studentHome";
import teacherHome from "../page/teacherHome";
import departmentHome from "../page/departmentHome";
import sectionHome from "../page/sectionHome";


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
	},
	{
		  path:'/studentHome',
		  name:'studentHome',
		  component:studentHome
	},
	{
		  path:'/teacherHome',
		  name:'teacherHome',
		  component:teacherHome
	},
	{
		  path:'/departmentHome',
		  name:'departmentHome',
		  component:departmentHome
	},
	{
		  path:'/sectionHome',
		  name:'sectionHome',
		  component:sectionHome
	},]
});