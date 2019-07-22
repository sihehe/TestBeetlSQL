sample
===
* 注释

	select #use("cols")# from sys_product  where  #use("condition")#

cols
===
	product_num,type_num,SKU,brand,product_name,style_num,colour_num,big_img,mid_img,small_img,price,NO,year,colour,model,season,texture,figure,fabric_info,other

updateSample
===
	
	product_num=#productNum#,type_num=#typeNum#,SKU=#sku#,brand=#brand#,product_name=#productName#,style_num=#styleNum#,colour_num=#colourNum#,big_img=#bigImg#,mid_img=#midImg#,small_img=#smallImg#,price=#price#,NO=#no#,year=#year#,colour=#colour#,model=#model#,season=#season#,texture=#texture#,figure=#figure#,fabric_info=#fabricInfo#,other=#other#

condition
===

	1 = 1  
	@if(!isEmpty(productNum)){
	 and product_num=#productNum#
	@}
	@if(!isEmpty(typeNum)){
	 and type_num=#typeNum#
	@}
	@if(!isEmpty(sku)){
	 and SKU=#sku#
	@}
	@if(!isEmpty(brand)){
	 and brand=#brand#
	@}
	@if(!isEmpty(productName)){
	 and product_name=#productName#
	@}
	@if(!isEmpty(styleNum)){
	 and style_num=#styleNum#
	@}
	@if(!isEmpty(colourNum)){
	 and colour_num=#colourNum#
	@}
	@if(!isEmpty(bigImg)){
	 and big_img=#bigImg#
	@}
	@if(!isEmpty(midImg)){
	 and mid_img=#midImg#
	@}
	@if(!isEmpty(smallImg)){
	 and small_img=#smallImg#
	@}
	@if(!isEmpty(price)){
	 and price=#price#
	@}
	@if(!isEmpty(no)){
	 and NO=#no#
	@}
	@if(!isEmpty(year)){
	 and year=#year#
	@}
	@if(!isEmpty(colour)){
	 and colour=#colour#
	@}
	@if(!isEmpty(model)){
	 and model=#model#
	@}
	@if(!isEmpty(season)){
	 and season=#season#
	@}
	@if(!isEmpty(texture)){
	 and texture=#texture#
	@}
	@if(!isEmpty(figure)){
	 and figure=#figure#
	@}
	@if(!isEmpty(fabricInfo)){
	 and fabric_info=#fabricInfo#
	@}
	@if(!isEmpty(other)){
	 and other=#other#
	@}
getProductList
===
    SELECT
    	p.* 
    FROM
    	sys_product p
    	LEFT JOIN sys_type t ON p.type_num = t.type_num 
    WHERE
    	p.season = #season# 
    	AND t.type_num = #type#
	