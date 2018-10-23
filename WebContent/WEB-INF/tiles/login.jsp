<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<script type="text/javascript">
$(document).ready(function(){
	$(f.username).focus()
})
</script>
	<h3>Login with Username and Password</h3>
	<div class="col-md-6 col-md-offset-3">
		<form class="form-horizontal" name="f"
			action="${pageContext.request.contextPath}/login" method="POST">
			<fieldset>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="username">Username</label>
					<div class="col-md-5">
						<input id="username" name="username"
							placeholder="username" class="form-control input-md" type="text" />
					</div>
				</div>

				<!-- Password input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="password">Password</label>
					<div class="col-md-5">
						<input id="password" name="password"
							placeholder="password" class="form-control input-md"
							type="password" />
					</div>

					<div class="form-group">
						<label>Remember me</label> 
						<input type='checkbox'
							name="_spring_security_remember_me" checked="checked" /><br />
					</div>
				</div>
				<div class="alert-danger">
					<c:if test="${param.error !=null}">
						<span>Something is wrong</span>
					</c:if>
				</div>
				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="singlebutton"></label>
					<div class="col-md-4">
						<button id="singlebutton" name="singlebutton"
							class="btn btn-primary">Submit</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>