<!doctype html>
<html th:fragment="layout (template, menu)">

<head>

  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="shortcut icon" type="image/x-icon" th:href="@{/resources/images/favicon.png}">

  <title>PetClinic :: a Spring Framework demonstration</title>

  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  <link th:href="@{/webjars/font-awesome/4.7.0/css/font-awesome.min.css}" rel="stylesheet">
  <link rel="stylesheet" th:href="@{/resources/css/petclinic.css}" />

</head>

<body>

  <nav class="navbar navbar-expand-lg navbar-dark" role="navigation">
    <div class="container-fluid">
      <a class="navbar-brand" th:href="@{/}"><span></span></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main-navbar">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="main-navbar" style>

        <ul class="navbar-nav me-auto mb-2 mb-lg-0" th:remove="all">

          <li th:fragment="menuItem (link,active,title,glyph,text)" th:class="nav-item">
            <a th:class="${active==menu ? 'nav-link active' : 'nav-link'}" th:href="@{__${link}__}" th:title="${title}">
              <span th:class="'fa fa-'+${glyph}" class="fa fa-home"></span>
              <span th:text="${text}">Template</span>
            </a>
          </li>

        </ul>

        <ul class="nav navbar-nav me-auto">

          <li th:replace="~{::menuItem ('/','home','home page','home','Home')}">
            <span class="fa fa-home" aria-hidden="true"></span>
            <span>Home</span>
          </li>

          <li th:replace="~{::menuItem ('/owners/find','owners','find owners','search','Find owners')}">
            <span class="fa fa-search" aria-hidden="true"></span>
            <span>Find owners</span>
          </li>

          <li th:replace="~{::menuItem ('/vets.html','vets','veterinarians','th-list','Veterinarians')}">
            <span class="fa fa-th-list" aria-hidden="true"></span>
            <span>Veterinarians</span>
          </li>

          <li
            th:replace="~{::menuItem ('/oups','error','trigger a RuntimeException to see how it is handled','exclamation-triangle','Error')}">
            <span class="fa exclamation-triangle" aria-hidden="true"></span>
            <span>Error</span>
          </li>

        </ul>
      </div>
    </div>
  </nav>
  <div class="container-fluid">
    <div class="container xd-container">

      <th:block th:insert="${template}" />

      <br />
      <br />
      <div class="container">
        <div class="row">
          <div class="col-12 text-center">
            <img src="../static/images/spring-logo.svg" th:src="@{/resources/images/spring-logo.svg}" alt="VMware Tanzu Logo" class="logo">
          </div>
        </div>
      </div>
    </div>
  </div>

  <script th:src="@{/webjars/bootstrap/5.3.2/dist/js/bootstrap.bundle.min.js}"></script>

</body>

</html>
