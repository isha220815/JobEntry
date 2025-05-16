 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>

 <div class="content-wrapper">
         <div class="container">
              <div class="row">
            
     <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-danger">
                        <div class="panel-heading">
                             <h2>Post a New Job</h2>
                        </div>
                        <div class="panel-body">
           
  
    <form action="admin_add_job" method="post">
    
        <div class="form-group">
            <label>Job Title</label>
            <input type="text" name="title" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Company Name</label>
            <input type="text" name="company" class="form-control" required>
        </div>

        <div class="form-group">
            <label>Job Description</label>
            <textarea name="description" class="form-control" rows="4" required></textarea>
        </div>

        <div class="form-group">
            <label>Location</label>
            <input type="text" name="location" class="form-control">
        </div>

        <div class="form-group">
            <label>Salary</label>
            <input type="text" name="salary" class="form-control">
        </div>

        <div class="form-group">
            <label>Requirements</label>
            <textarea name="requirements" class="form-control" rows="3"></textarea>
        </div>

        <div class="form-group">
            <label>Job Type</label>
            <select name="jobType" class="form-control">
                <option value="Full-Time">Full-Time</option>
                <option value="Part-Time">Part-Time</option>
                <option value="Internship">Internship</option>
                <option value="Contract">Contract</option>
            </select>
        </div>

        <div class="form-group">
            <label>Contact Email</label>
            <input type="email" name="contactEmail" class="form-control">
        </div>

        <div class="form-group form-check">
            <input type="checkbox" name="active" class="form-check-input" checked>
            <label class="form-check-label">Is Active</label>
        </div>

        <button type="submit" class="btn btn-primary">Post Job</button>
    </form>
</div>
                            </div>
                        </div>
                            </div>
                            </div>
                            </div>
                       
   

</body>
 <%@ include file="footer.jsp" %>
</html> 
