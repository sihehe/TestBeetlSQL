sample
===
* 注释

	select #use("cols")# from sys_user  where  #use("condition")#

cols
===
	id,username,account,password,role

updateSample
===
	
	id=#id#,username=#username#,account=#account#,password=#password#,role=#role#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(username)){
	 and username=#username#
	@}
	@if(!isEmpty(account)){
	 and account=#account#
	@}
	@if(!isEmpty(password)){
	 and password=#password#
	@}
	@if(!isEmpty(role)){
	 and role=#role#
	@}
findOne
===
    select #use("cols")# from sys_user where id = #id#
pageQuery
===
    select @pageTag(){
    *
    @}
    from sys_user
	