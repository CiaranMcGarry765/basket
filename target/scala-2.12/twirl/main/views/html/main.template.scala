
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
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

    <title>Product Catalogue - """),_display_(/*14.33*/title),format.raw/*14.38*/("""</title>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
    integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Custom CSS -->
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*25.74*/("""" rel="stylesheet"> 

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
                    <a class="navbar-brand" href=""""),_display_(/*50.52*/routes/*50.58*/.ProductCtrl.listProducts(0)),format.raw/*50.86*/("""">C MUSIC</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href=""""),_display_(/*56.39*/routes/*56.45*/.ProductCtrl.about()),format.raw/*56.65*/("""">About</a>
                        </li>
                        <li>
                            <a href=""""),_display_(/*59.39*/routes/*59.45*/.ProductCtrl.contact()),format.raw/*59.67*/("""">Contact</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*63.30*/if(user != null)/*63.46*/ {_display_(Seq[Any](format.raw/*63.48*/("""
                                """),format.raw/*64.33*/("""<a href=""""),_display_(/*64.43*/controllers/*64.54*/.security.routes.LoginCtrl.logout()),format.raw/*64.89*/("""">Logout """),_display_(/*64.99*/user/*64.103*/.getName()),format.raw/*64.113*/("""</a>
                            """)))}/*65.31*/else/*65.36*/{_display_(Seq[Any](format.raw/*65.37*/("""
                                """),format.raw/*66.33*/("""<a href=""""),_display_(/*66.43*/controllers/*66.54*/.security.routes.LoginCtrl.login()),format.raw/*66.88*/("""">Login</a>
                            """)))}),format.raw/*67.30*/("""
                        """),format.raw/*68.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*70.39*/routes/*70.45*/.ShoppingCtrl.showBasket()),format.raw/*70.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
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
                    <p class="lead">"""),_display_(/*85.38*/title),format.raw/*85.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*90.14*/content),format.raw/*90.21*/("""
            """),format.raw/*91.13*/("""<!-- End Content -->

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
                        <p>Products Catalogue Footer</p>
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

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 26 16:57:09 GMT 2019
                  SOURCE: /home/wdd/basket/app/views/main.scala.html
                  HASH: 0f090874c327e08042c30dc321f06d20fb764c0a
                  MATRIX: 970->1|1119->57|1146->58|1483->368|1509->373|2113->950|2128->956|2199->1006|3446->2226|3461->2232|3510->2260|3864->2587|3879->2593|3920->2613|4056->2722|4071->2728|4114->2750|4341->2950|4366->2966|4406->2968|4467->3001|4504->3011|4524->3022|4580->3057|4617->3067|4631->3071|4663->3081|4716->3116|4729->3121|4768->3122|4829->3155|4866->3165|4886->3176|4941->3210|5013->3251|5066->3276|5166->3349|5181->3355|5228->3381|5711->3837|5737->3842|5859->3937|5887->3944|5928->3957
                  LINES: 28->1|33->2|34->3|45->14|45->14|56->25|56->25|56->25|81->50|81->50|81->50|87->56|87->56|87->56|90->59|90->59|90->59|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|99->68|101->70|101->70|101->70|116->85|116->85|121->90|121->90|122->91
                  -- GENERATED --
              */
          