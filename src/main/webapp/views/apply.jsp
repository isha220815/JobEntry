<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Apply for Job</title>

    <!-- Bootstrap CDN (optional if already in header.jsp) -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Inner CSS -->
    <style>
        /* Navbar customization */
        .navbar {
            background-color: #28a745 !important; /* Green navbar */
        }

        .navbar .nav-link,
        .navbar .navbar-brand {
            color: white !important;
            font-weight: 500;
        }

        .navbar .nav-link:hover,
        .navbar .nav-link.active {
            background-color: #218838;
            color: #fff !important;
        }

        .btn-primary {
            background-color: #28a745;
            border: none;
        }

        .btn-primary:hover {
            background-color: #218838;
        }

        /* Form container */
        .apply-form-container {
            max-width: 700px;
            margin: 60px auto;
            padding: 30px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
        }

        .apply-form-container h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #28a745;
        }

        .apply-form-container label {
            font-weight: 500;
            color: #333;
        }

        .apply-form-container .form-control {
            margin-bottom: 20px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .apply-form-container .btn-primary {
            width: 100%;
            padding: 12px;
            font-weight: bold;
            font-size: 16px;
            border-radius: 6px;
        }
    </style>
</head>
<body>

<!-- ✅ Navbar Start -->
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">JobEntry</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/job_list">Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/about">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/contact">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/reg">Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/login">Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<!-- ✅ Navbar End -->

<!-- ✅ Apply Form -->
<div class="container apply-form-container">

    <!-- ✅ Success Message -->
    <c:if test="${not empty message}">
        <div class="alert alert-success text-center" role="alert">
            ${message}
        </div>
    </c:if>

    <h2>Apply for Job</h2>
    <form action="${pageContext.request.contextPath}/submitApplication" method="post" enctype="multipart/form-data">
        <input type="hidden" name="jobId" value="${jobId}" />

        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" class="form-control" required />

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" class="form-control" required />

        <label for="contact">Contact:</label>
        <input type="text" id="contact" name="contact" class="form-control" required />

        <label for="skills">Skills:</label>
        <input type="text" id="skills" name="skills" class="form-control" required />

        <label for="location">Location:</label>
        <input type="text" id="location" name="location" class="form-control" required />

        <label for="resume">Resume:</label>
        <input type="file" id="resume" name="resume" class="form-control" accept=".pdf,.doc,.docx" required />

        <button type="submit" class="btn btn-primary mt-3">Submit Application</button>
    </form>
</div>

<!-- Optional: Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
