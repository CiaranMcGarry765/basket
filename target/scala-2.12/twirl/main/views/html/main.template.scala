
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

    <title>C MUSIC - """),_display_(/*14.23*/title),format.raw/*14.28*/("""</title>
    
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

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 13:29:18 IST 2019
                  SOURCE: /home/wdd/basket/app/views/main.scala.html
                  HASH: 5ef2650354f17de365b9e8c32e9b4f3dcac35ad9
                  MATRIX: 970->1|1119->57|1146->58|1473->358|1499->363|2103->940|2118->946|2189->996|3436->2216|3451->2222|3500->2250|3854->2577|3869->2583|3910->2603|4046->2712|4061->2718|4104->2740|4331->2940|4356->2956|4396->2958|4457->2991|4494->3001|4514->3012|4570->3047|4607->3057|4621->3061|4653->3071|4706->3106|4719->3111|4758->3112|4819->3145|4856->3155|4876->3166|4931->3200|5003->3241|5056->3266|5156->3339|5171->3345|5218->3371|5701->3827|5727->3832|5849->3927|5877->3934|5918->3947
                  LINES: 28->1|33->2|34->3|45->14|45->14|56->25|56->25|56->25|81->50|81->50|81->50|87->56|87->56|87->56|90->59|90->59|90->59|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|99->68|101->70|101->70|101->70|116->85|116->85|121->90|121->90|122->91
                  -- GENERATED --
              */
          