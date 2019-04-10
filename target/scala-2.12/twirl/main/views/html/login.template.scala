
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(LoginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login Required", user)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
"""),format.raw/*5.1*/("""<div class="col-xs-4">
  <h3>Sign in</h3>
	<!-- Display login errors if they exist -->
	"""),_display_(/*8.3*/if(LoginForm.hasGlobalErrors)/*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
		  """),format.raw/*9.5*/("""<p class="alert alert-warning">
		      """),_display_(/*10.10*/LoginForm/*10.19*/.globalError.message),format.raw/*10.39*/("""
		  """),format.raw/*11.5*/("""</p>
	""")))}),format.raw/*12.3*/("""
    """),_display_(/*13.6*/if(flash.containsKey("error"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
		  """),format.raw/*14.5*/("""<div class="alert alert-warning">
		      """),_display_(/*15.10*/flash/*15.15*/.get("loginRequired")),format.raw/*15.36*/("""
		  """),format.raw/*16.5*/("""</div>
	""")))}),format.raw/*17.3*/("""
	"""),format.raw/*18.2*/("""<!-- The login form -->
	"""),_display_(/*19.3*/helper/*19.9*/.form(CSRF(controllers.security.routes.LoginCtrl.loginSubmit()))/*19.73*/ {_display_(Seq[Any](format.raw/*19.75*/("""

    """),format.raw/*21.5*/("""<div class="form-group">
        <input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*22.99*/LoginForm("email")/*22.117*/.getValue.orElse("")),format.raw/*22.137*/("""">
    </div>
    <div class="form-group">
        <input type="password" name="password" class="form-control input-xs" placeholder="Password">
    </div>

		<!-- Add a submit button -->
		<div class="form-group">
		    <input type="submit" value="Sign In" class="btn btn-primary">
		</div>
		""")))}),format.raw/*32.4*/("""
"""),format.raw/*33.1*/("""</div>
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(LoginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(LoginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (LoginForm,user) => apply(LoginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 13:29:18 IST 2019
                  SOURCE: /home/wdd/basket/app/views/login.scala.html
                  HASH: ce271b74ff524a36a0937aa3d46ff0479959127b
                  MATRIX: 984->1|1119->65|1163->81|1190->83|1226->111|1265->113|1292->114|1406->203|1443->232|1482->234|1513->239|1581->280|1599->289|1640->309|1672->314|1709->321|1741->327|1780->357|1820->359|1852->364|1922->407|1936->412|1978->433|2010->438|2049->447|2078->449|2130->475|2144->481|2217->545|2257->547|2290->553|2440->676|2468->694|2510->714|2834->1008|2862->1009|2900->1017
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|50->19|50->19|50->19|50->19|52->21|53->22|53->22|53->22|63->32|64->33|65->34
                  -- GENERATED --
              */
          