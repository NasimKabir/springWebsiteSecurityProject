
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<div class="col-md-6 col-md-offset-3">
		<sf:form method="post" class="form-horizontal"
			action="${pageContext.request.contextPath}/created" modelAttribute="offerfrom">
			<fieldset>

				<!-- Form Name -->
				<legend>Create Notice</legend>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="name">Name</label>
					<div class="controls">
						<sf:input path="name" placeholder="enter name"
							class="input-xlarge" />
						<br />
						<sf:errors path="name" cssStyle="color:red"></sf:errors>
					</div>
				</div>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="email">Email</label>
					<div class="controls">
						<sf:input id="email" name="email" path="email" placeholder="enter valid email"
							class="input-xlarge" type="text" />
						<br />
						<sf:errors path="email" cssStyle="color:red"></sf:errors>
					</div>
				</div>

				<!-- Textarea -->
				<div class="control-group">
					<label class="control-label" for="text">Offer</label>
					<div class="controls">
						<sf:textarea id="text" name="text" path="text"></sf:textarea>
						<br />
						<sf:errors path="text" cssStyle="color:red"></sf:errors>
					</div>
				</div>

				<!-- Button -->
				<div class="control-group">
					<label class="control-label" for="submit"></label>
					<div class="controls">
						<button id="submit" name="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>

			</fieldset>
		</sf:form>
	</div>
