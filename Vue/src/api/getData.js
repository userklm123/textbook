import request from '../utils/request.js'
//获取doc集合数据
export function getStudentById(data) {
	return request({
		url: '/student/getStudentById',//请求接口
		method: 'post',//请求方式
		data//请求参数
	})
}
export function getTeacherById(data) {
	return request({
		url: '/teacher/getTeacherById',//请求接口
		method: 'post',//请求方式
		data//请求参数
	})
}
export function getDepartmentById(data) {
	return request({
		url: '/department/getDepartmentById',//请求接口
		method: 'post',//请求方式
		data//请求参数
	})
}
export function getAdminById(data) {
	return request({
		url: '/admin/getAdminById',//请求接口
		method: 'post',//请求方式
		data//请求参数
	})
}