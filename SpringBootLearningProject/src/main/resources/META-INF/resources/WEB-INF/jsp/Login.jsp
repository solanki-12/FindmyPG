

<html lang="en" xmlns:th="http://www.thymeLeaf.org">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">


    <title>Login</title>

    <link rel="stylesheet" href="" th:href="@{../../../../static/bootstrap/css/bootstrap.min.css}" />
    <link rel="stylesheet" href="" th:href="@{../../../../static/css/Login-Form-Basic-icons.css}" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abril+Fatface&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Aclonica&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Akaya+Kanadaka&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Arvo&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Bree+Serif&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Bubblegum+Sans&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Merriweather+Sans&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Pacifico&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Condensed&amp;display=swap">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="../../../../static/css/Login-Form-Basic-icons.css">
</head>

<body class="fs-3 fw-normal" style="font-family: 'Merriweather Sans', sans-serif;background: rgb(255,255,255);filter: blur(0px);">
<section class="position-relative py-4 py-xl-5">
    <div class="container">
        <div class="row d-flex justify-content-center" style="font-family: 'Merriweather Sans', sans-serif;">
            <div class="col-md-6 col-xl-4">
                <div class="card mb-5" data-bss-hover-animate="pulse" style="width: 417px;margin-left: -30px;border-radius: 38px;background: url(&quot;https://cdn.bootstrapstudio.io/placeholders/1400x800.png&quot;);margin-top: 60px;border: 3px solid rgb(157,200,249);">
                    <div class="card-body d-flex flex-column align-items-center" style="background: var(--bs-card-bg);border-radius: 35px;margin-left: 0px;border-style: none;filter: blur(0px);"><img src="../../../../static/img/loginlogo.png" width="50" height="53" style="margin-left: 124px;margin-top: 16px;width: 54px;height: 48px;margin-bottom: 2px;background: #ffffff;color: rgb(0,0,0);"><label class="form-label fs-2 fw-semibold" data-bss-hover-animate="rubberBand" style="margin-top: -48px;margin-bottom: 51px;margin-left: -15px;font-family: 'Merriweather Sans', sans-serif;color: rgb(0,0,0);">Login</label>
                        <form action="http://localhost:8081/save" method="post">
                            <div class="mb-3">
                            <input class="bg-white border rounded-pill border-2 border-dark form-control" type="email" data-bss-hover-animate="pulse" name="username" placeholder="username" minlength="5" pattern="^[a-zA-Z0-9_.-]*$" maxlength="15" required="" style="text-align: center;background: rgb(255, 255, 255);border-width: 2px;border-radius: 800px;width: 273px;height: 40px;margin-left: 33px;margin-top: 30px;padding: 7px 12px;">
                            </div>
                            <div class="mb-3">
                            <input class="border rounded-pill border-2 border-dark form-control" type="password" data-bss-hover-animate="pulse" minlength="5" maxlength="10" required="" style="border-width: 2px;border-color: var(--bs-black);border-radius: 800px;text-align: center;width: 273px;margin-left: 33px;margin-top: 36px;" name="password" placeholder="Password" pattern="^(?!.*\s)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[~`!@#$%^&amp;*()--+={}\[\]|\\:;&quot;'<>,.?/_₹]).{10,16}$">
                            </div>
                            <button class="btn btn-primary" data-bss-hover-animate="pulse" type="button" style="width: 101.5px;margin-left: 119px;margin-top: 34px;background: rgb(23,21,22);border-style: none;border-radius: 21px;">Login</button>
                            <div class="mb-3">
                            </div>
                            <label class="form-label fw-normal text-dark" style="font-size: 17.4px;color: var(--bs-blue);margin-left: 68px;font-family: 'Merriweather Sans', sans-serif;">Not a member?&nbsp;</label>
                            <label class="form-label fw-semibold" data-bss-hover-animate="pulse" style="font-size: 18.4px;color: var(--bs-purple);font-family: 'Merriweather Sans', sans-serif;">Register now</label>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section><iframe allowfullscreen="" frameborder="0" loading="lazy" src="https://www.google.com/maps/embed/v1/place?key=AIzaSyCLIwQ-ZaMdIiaQ5ZwrJB2V_LoasZEIqi4&amp;q=india%2C+ghaziabad%2C+mariam+nagar+sewa+nagar%2C+christ+ncr&amp;zoom=13" data-bss-hover-animate="pulse" width="100%" height="400" style="height: 330px;border-width: 3px;border-style: solid;border-top-style: groove;border-right-style: none;border-left-style: none;border-radius: 0px;filter: blur(0px) brightness(72%) contrast(185%) grayscale(0%) hue-rotate(0deg) invert(0%) saturate(135%);opacity: 0.92;"></iframe>
<script src="../../../../static/bootstrap/js/bootstrap.min.js"></script>
<script src="../../../../static/js/bs-init.js"></script>

</body>

</html>


