// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/basket/conf/routes
// @DATE:Wed Mar 20 15:54:27 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}