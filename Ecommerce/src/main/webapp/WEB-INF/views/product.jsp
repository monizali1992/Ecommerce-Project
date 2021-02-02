
<div class="container">

	<div class="row">

		<div class="col-md-3">
			<h1 class="my-4">Shop Name</h1>
		
			<%@include file="./shared/sidebar.jsp"%>

		</div>


		<div class="col-md-9">
			<div class="col-lg-12">
			
			<c:if test="${userClickProduct ==true}">
							<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a>
					<li><a href="#">Products</a>
					<li class="active"><a
						href="${contextRoot}/show/all/product">CategoryProducts
					</a>
				</ol>
			</c:if>
			
			
			<c:if test="${userClickCategoryProduct==true}">
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a>
					<li><a href="#">Category</a>
					<li class="active"><a
						href="${contextRoot}/show/category/${category.id}/product">CategoryProducts
					</a>
				</ol>
				</c:if>
				
			</div>

		</div>
	</div>
</div>