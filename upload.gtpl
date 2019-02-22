<html>
  <head>
         <title>Magnificent image classifier</title>
         <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  </head>
  <body>
  <div  id="app">
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">Magnificent Image Classifier</a>
                </div>
                
            </div>
    </nav>

    <div class="container" style="margin-top: 10px;">
    <div class="card" >
          <div class="card-header">
              Upload a file
          </div>
          <div class="card-body">
              <form enctype="multipart/form-data" action="/" method="post">
                      
                      <input class="form-control-file" type="file" name="uploadfile" /><br>
            
                      <button class="form-control btn btn-primary btn-sm" type="submit">Upload file</button>
              </form>
            </div>
          </div>
    </div>
    </div>
  </body>
  </html>