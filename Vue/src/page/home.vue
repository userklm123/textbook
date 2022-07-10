<template>
    <div>
		 <div>
			 <el-input placeholder="用户ID" v-model="userId"> </el-input>
			 <el-input placeholder="密码" v-model="userPw" show-password></el-input>
			 <el-select label-in-value v-model="inspectPrograme">
			 	<el-option
			 	     v-for="item in inspectProgrammeList"
			 	     :key="item.key"
			 	     :value="item.label"
			 	  >
			 	 </el-option>
			  </el-select>
			  <el-button @click="loginClick">登录按钮</el-button>
		 </div>
    </div>
</template>

<script>
	
	import { setStorage, getStorage} from "../utils/localStorage.js";
	import { getStudentById,getTeacherById,getDepartmentById,getAdminById } from '../api/getData.js';
	export default {	
		data() {
			return {
				userPw: "",//被选择的下拉
				userId: "",//用于条件查询
				inspectProgrammeList: [
					{"key":"key1","label":"学生"},
					{"key":"key2","label":"老师"},
					{"key":"key3","label":"系部"},
					{"key":"key4","label":"教材部"},
					{"key":"key5","label":"系统管理员"},
				],
				inspectPrograme:{
				        key:"",
				        label:"",
				      },
				studentList:{
			          studentId:"",
			          studentPw:"",
					  },
				adminUser:{
					  adminId:"",
					  adminPw:"",
					  },
				}
		},
		methods: {
			
			initUserList(){
					console.log(this.inspectPrograme);
					//条件筛选遍历
					/* let filterArr = this.docList.filter((item, index) => {
						return item.docId % 5 == 0;
					}); */
			},
			loginClick(){
				if(this.inspectPrograme=="学生"){
				  
				}
				else if(this.inspectPrograme=="老师"){
			      
			    }
				else if(this.inspectPrograme=="系部"){
				  
				}
				else if(this.inspectPrograme=="教材部"){
				  
				}
				else{
				    let data = {
				  		adminId :this.userId,
				  		adminPw :this.userPw,
				  	}
				    getAdminById(data).then((res) => {
				  	  	console.log(res)	
						this.adminUser=res;
				  	  })
					setTimeout(() => {
					if(this.adminUser.adminPw==this.userPw) this.$router.push({path:'/adminHome'});
					else alert("用户名或密码错误！");// 方法区
					}, 50);
				}
					//条件筛选遍历
					/* let filterArr = this.docList.filter((item, index) => {
						return item.docId % 5 == 0;
					}); */
			},
			           
		},
		mounted() {
			console.log("mounted被调用");
			this.$nextTick(() => {
			})
		},
		beforeCreate(){
			console.log("beforeCreate被调用");
		},
		created() {
			console.log("created被调用");
		},
		beforeMount() {
			console.log("beforeMount被调用");
		},
		beforeUpdate() {
			console.log("beforeUpdate被调用");
		},
		updated() {
			console.log("updated被调用");
		},
		beforeDestroy() {
			console.log("beforeDestroy被调用");
		},
		destroyed() {
			console.log("destroyed被调用");
		},
		
}
</script>

<style>
.table-style-thead{
	width:100%;	
}
.table-style-thead-th{
	width: 250px;
}
  .el-select .el-input {
    width: 130px;
  }
  .input-with-select .el-input-group__prepend {
    background-color: #fff;
  }
</style>