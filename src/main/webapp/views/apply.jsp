<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Apply for Job</title></head>
<%@ include file="header.jsp" %>
<body>
    <h2>Apply for Job</h2>
    <form action="${pageContext.request.contextPath}/submitApplication" method="post" enctype="multipart/form-data">
        <input type="hidden" name="jobId" value="${jobId}" />

        Full Name: <input type="text" name="fullName" required /><br/>
        Email: <input type="email" name="email" required /><br/>
        Contact: <input type="text" name="contact" required /><br/>
        Skills: <input type="text" name="skills" required /><br/>
        Location: <input type="text" name="location" required /><br/>
        Resume: <input type="file" name="resume" accept=".pdf,.doc,.docx" required /><br/>

        <input type="submit" value="Submit Application" />
    </form>
</body>
<%@ include file="footer.jsp" %>
</html>
