// @SOURCE:/Users/njm1688/MyProjects/NewProjectRender/conf/routes
// @HASH:af44a2c723b2564a67b2d408d3be682ba0896baa
// @DATE:Wed May 04 14:03:28 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:38
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:38
class ReverseAssets {


// @LINE:38
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:16
// @LINE:14
class Reversedelete {


// @LINE:16
def delete(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteData")
}
                        

// @LINE:14
def renderDeletePage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deleteData")
}
                        

}
                          

// @LINE:30
// @LINE:26
class Reverseupdate {


// @LINE:30
def update(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateData")
}
                        

// @LINE:26
def renderUpdatePage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "updateData")
}
                        

}
                          

// @LINE:11
// @LINE:9
class Reverseadd {


// @LINE:9
def renderAddPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "addData")
}
                        

// @LINE:11
def add(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addData")
}
                        

}
                          

// @LINE:28
// @LINE:22
// @LINE:20
class Reversesearch {


// @LINE:28
// @LINE:22
def search(id:String, value:String): Call = {
   (id: @unchecked, value: @unchecked) match {
// @LINE:22
case (id, value)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "searchD/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/" + implicitly[PathBindable[String]].unbind("value", dynamicString(value)))
                                         
   }
}
                                                

// @LINE:20
def renderSearchPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchData")
}
                        

}
                          
}
                  


// @LINE:38
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:38
class ReverseAssets {


// @LINE:38
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:16
// @LINE:14
class Reversedelete {


// @LINE:16
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.delete.delete",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteData"})
      }
   """
)
                        

// @LINE:14
def renderDeletePage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.delete.renderDeletePage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteData"})
      }
   """
)
                        

}
              

// @LINE:30
// @LINE:26
class Reverseupdate {


// @LINE:30
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.update.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateData"})
      }
   """
)
                        

// @LINE:26
def renderUpdatePage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.update.renderUpdatePage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateData"})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:9
class Reverseadd {


// @LINE:9
def renderAddPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.add.renderAddPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addData"})
      }
   """
)
                        

// @LINE:11
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.add.add",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addData"})
      }
   """
)
                        

}
              

// @LINE:28
// @LINE:22
// @LINE:20
class Reversesearch {


// @LINE:28
// @LINE:22
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.search.search",
   """
      function(id, value) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchD/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("value", encodeURIComponent(value))})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateD/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("value", encodeURIComponent(value))})
      }
      }
   """
)
                        

// @LINE:20
def renderSearchPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.search.renderSearchPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchData"})
      }
   """
)
                        

}
              
}
        


// @LINE:38
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:22
// @LINE:20
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:38
class ReverseAssets {


// @LINE:38
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:16
// @LINE:14
class Reversedelete {


// @LINE:16
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.delete.delete(), HandlerDef(this.getClass.getClassLoader, "", "controllers.delete", "delete", Seq(), "POST", """""", _prefix + """deleteData""")
)
                      

// @LINE:14
def renderDeletePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.delete.renderDeletePage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.delete", "renderDeletePage", Seq(), "GET", """""", _prefix + """deleteData""")
)
                      

}
                          

// @LINE:30
// @LINE:26
class Reverseupdate {


// @LINE:30
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.update.update(), HandlerDef(this.getClass.getClassLoader, "", "controllers.update", "update", Seq(), "POST", """""", _prefix + """updateData""")
)
                      

// @LINE:26
def renderUpdatePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.update.renderUpdatePage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.update", "renderUpdatePage", Seq(), "GET", """""", _prefix + """updateData""")
)
                      

}
                          

// @LINE:11
// @LINE:9
class Reverseadd {


// @LINE:9
def renderAddPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.add.renderAddPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.add", "renderAddPage", Seq(), "GET", """""", _prefix + """addData""")
)
                      

// @LINE:11
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.add.add(), HandlerDef(this.getClass.getClassLoader, "", "controllers.add", "add", Seq(), "POST", """""", _prefix + """addData""")
)
                      

}
                          

// @LINE:28
// @LINE:22
// @LINE:20
class Reversesearch {


// @LINE:22
def search(id:String, value:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.search.search(id, value), HandlerDef(this.getClass.getClassLoader, "", "controllers.search", "search", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """searchD/$id<[^/]+>/$value<[^/]+>""")
)
                      

// @LINE:20
def renderSearchPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.search.renderSearchPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.search", "renderSearchPage", Seq(), "GET", """""", _prefix + """searchData""")
)
                      

}
                          
}
        
    