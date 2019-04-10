
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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

    <title>About - """),_display_(/*14.21*/title),format.raw/*14.26*/("""</title>
    
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
            
            <div class="container">
                <h2>WHO ARE WE?</h2>
                
                <div class="well">We started this page through our passion for music. Each of us
                    have our own story through music that brought us to this page. We want to share with you the customer our journeys in the music industry.
                </div>
                <div class="well">
                <h4>Conor (X00146070) :</h4> <p>I began listening to music at a young age listening to my dads old record collection, whic included musicsal
                classics like Pink Floyds "The Wall".</p>
                <img src="project/public/images/OtherImages/PinkFloyd.jpg" class="img-rounded" alt="Pink Floyd - The Wall" width="304" height="236"> 
                <p>As I grew older I began exploring my own tastes in the music world.This involved many huge artists such as Damon Albarn and his many Colaborative 
                projects such as Gorillaz and The Good The Bad and the Queen. </p>
                <p>These many artists allowed me to explore many genres and inspire me to begin learning and playing music with such instruments like the Fender Bass 
                    available from our product selection <a href="http://localhost:9000/listProducts?cat=3">here</a>.
                </p> 
                </div>

                <div class="well">
                    <h4>Calvin (X00145307) :</h4> 
                        <p>I began writing and playing music from very early in my career. It helped me escape to my own music world so to speak.
                        </p>
                        <p>I Listen to many past and current artist in the music industry. These include legendary albums like "Abbey Road" by the Beatles and 
                            more current artists Like Ed Sheeran and his <a href="http://localhost:9000/listProducts?cat=6&filter=X">Album X</a>.
                        </p>
                        <p>As I began writing and composing music, I felt I wanted to share what I was making with the world. So I created my own <a href="https://open.spotify.com/artist/5k4mgNHwJFKYRxgz0a11is">Spotify Account</a> and began to 
                            produce and display my music to a larger and more available accross the world.
                        </p> 
                </div>

                <div class="well">
                        <h4>Ciaran (X00145140) :</h4> <p>I began listening to club and house music when I grew older and began to try understand how this genre of music
                            was composed and created</p>
                        </div>
                
                
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
                  DATE: Wed Apr 10 13:29:18 IST 2019
                  SOURCE: /home/wdd/basket/app/views/about.scala.html
                  HASH: 74797cb8d876dd751dd5674c36add57c06dff7a3
                  MATRIX: 966->1|1100->42|1127->43|1452->341|1478->346|2987->1828|3002->1834|3051->1862|3405->2189|3420->2195|3461->2215|3597->2324|3612->2330|3655->2352|3882->2552|3907->2568|3947->2570|4008->2603|4045->2613|4065->2624|4121->2659|4158->2669|4172->2673|4204->2683|4257->2718|4270->2723|4309->2724|4370->2757|4407->2767|4427->2778|4482->2812|4554->2853|4607->2878|4707->2951|4722->2957|4769->2983|5252->3439|5278->3444
                  LINES: 28->1|33->2|34->3|45->14|45->14|76->45|76->45|76->45|82->51|82->51|82->51|85->54|85->54|85->54|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|94->63|96->65|96->65|96->65|111->80|111->80
                  -- GENERATED --
              */
          