
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Contact - """),_display_(/*14.23*/title),format.raw/*14.28*/("""</title>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

   

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <!-- Site header and navigation -->
    <header class="top" role="header">
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*45.52*/routes/*45.58*/.ProductCtrl.listProducts(0)),format.raw/*45.86*/("""">C MUSIC</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href=""""),_display_(/*51.39*/routes/*51.45*/.ProductCtrl.about()),format.raw/*51.65*/("""">About</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*54.39*/routes/*54.45*/.ProductCtrl.contact()),format.raw/*54.67*/("""">Contact</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*58.30*/if(user != null)/*58.46*/ {_display_(Seq[Any](format.raw/*58.48*/("""
                                """),format.raw/*59.33*/("""<a href=""""),_display_(/*59.43*/controllers/*59.54*/.security.routes.LoginCtrl.logout()),format.raw/*59.89*/("""">Logout """),_display_(/*59.99*/user/*59.103*/.getName()),format.raw/*59.113*/("""</a>
                            """)))}/*60.31*/else/*60.36*/{_display_(Seq[Any](format.raw/*60.37*/("""
                                """),format.raw/*61.33*/("""<a href=""""),_display_(/*61.43*/controllers/*61.54*/.security.routes.LoginCtrl.login()),format.raw/*61.88*/("""">Login</a>
                            """)))}),format.raw/*62.30*/("""
                        """),format.raw/*63.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*65.39*/routes/*65.45*/.ShoppingCtrl.showBasket()),format.raw/*65.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>
    </header>

    <!-- Page Content -->
    <div class="middle">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="lead">"""),_display_(/*80.38*/title),format.raw/*80.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            <br> </br>
            <h3>Contact </h3>
            
            <div class="form-group">
                <input type="text" name="subject" class="form-control input-xs" placeholder="Subject" >
            </div>
            <div class="form-group">
                <input type="text" name=" " class="form-control input-xs" placeholder="Text" >
            </div>
        
                <!-- Add a submit button -->
                <div class="form-group">
                    <input type="submit" value="Submit" class="btn btn-primary">
                </div>

                <div class="well"><h5>
                    <p>Phone - 016235175</p></h5>
                    <p>Email - Admin©CMusic.com </p>
                </div>
            <!-- End Content -->

        </div>
        <!-- /.container -->
    </div>

    <!-- Footer -->
    <div class="bottom">
        <div class="container">
            <hr>
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Created by </p>
                    <p>Calvin Hynes X00145307</p>
                    <p>Ciaran McGarry X00145140</p>
                    <p>Conor Morrin X00146070</p>
                    </div>
                </div>
            </footer>
        </div>
    <!-- /.container -->
    </div>

    <!-- jQuery -->
<script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(title,user)

  def f:((String,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => apply(title,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 13:44:08 IST 2019
                  SOURCE: /home/wdd/basket/app/views/contact.scala.html
                  HASH: a9630635be062e7f74cd4e19a3a5a524c4fd5e56
                  MATRIX: 968->1|1102->42|1129->43|1456->343|1482->348|2991->1830|3006->1836|3055->1864|3409->2191|3424->2197|3465->2217|3601->2326|3616->2332|3659->2354|3886->2554|3911->2570|3951->2572|4012->2605|4049->2615|4069->2626|4125->2661|4162->2671|4176->2675|4208->2685|4261->2720|4274->2725|4313->2726|4374->2759|4411->2769|4431->2780|4486->2814|4558->2855|4611->2880|4711->2953|4726->2959|4773->2985|5256->3441|5282->3446
                  LINES: 28->1|33->2|34->3|45->14|45->14|76->45|76->45|76->45|82->51|82->51|82->51|85->54|85->54|85->54|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|94->63|96->65|96->65|96->65|111->80|111->80
                  -- GENERATED --
              */
          