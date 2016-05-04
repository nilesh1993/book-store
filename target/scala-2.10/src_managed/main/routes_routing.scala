// @SOURCE:/Users/njm1688/MyProjects/NewProjectRender/conf/routes
// @HASH:af44a2c723b2564a67b2d408d3be682ba0896baa
// @DATE:Wed May 04 14:03:28 IST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_add_renderAddPage1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addData"))))
private[this] lazy val controllers_add_renderAddPage1_invoker = createInvoker(
controllers.add.renderAddPage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.add", "renderAddPage", Nil,"GET", """""", Routes.prefix + """addData"""))
        

// @LINE:11
private[this] lazy val controllers_add_add2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addData"))))
private[this] lazy val controllers_add_add2_invoker = createInvoker(
controllers.add.add,
HandlerDef(this.getClass.getClassLoader, "", "controllers.add", "add", Nil,"POST", """""", Routes.prefix + """addData"""))
        

// @LINE:14
private[this] lazy val controllers_delete_renderDeletePage3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteData"))))
private[this] lazy val controllers_delete_renderDeletePage3_invoker = createInvoker(
controllers.delete.renderDeletePage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.delete", "renderDeletePage", Nil,"GET", """""", Routes.prefix + """deleteData"""))
        

// @LINE:16
private[this] lazy val controllers_delete_delete4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteData"))))
private[this] lazy val controllers_delete_delete4_invoker = createInvoker(
controllers.delete.delete,
HandlerDef(this.getClass.getClassLoader, "", "controllers.delete", "delete", Nil,"POST", """""", Routes.prefix + """deleteData"""))
        

// @LINE:20
private[this] lazy val controllers_search_renderSearchPage5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchData"))))
private[this] lazy val controllers_search_renderSearchPage5_invoker = createInvoker(
controllers.search.renderSearchPage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.search", "renderSearchPage", Nil,"GET", """""", Routes.prefix + """searchData"""))
        

// @LINE:22
private[this] lazy val controllers_search_search6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchD/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("value", """[^/]+""",true))))
private[this] lazy val controllers_search_search6_invoker = createInvoker(
controllers.search.search(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.search", "search", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """searchD/$id<[^/]+>/$value<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_update_renderUpdatePage7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateData"))))
private[this] lazy val controllers_update_renderUpdatePage7_invoker = createInvoker(
controllers.update.renderUpdatePage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.update", "renderUpdatePage", Nil,"GET", """""", Routes.prefix + """updateData"""))
        

// @LINE:28
private[this] lazy val controllers_search_search8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateD/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("value", """[^/]+""",true))))
private[this] lazy val controllers_search_search8_invoker = createInvoker(
controllers.search.search(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.search", "search", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """updateD/$id<[^/]+>/$value<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_update_update9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateData"))))
private[this] lazy val controllers_update_update9_invoker = createInvoker(
controllers.update.update,
HandlerDef(this.getClass.getClassLoader, "", "controllers.update", "update", Nil,"POST", """""", Routes.prefix + """updateData"""))
        

// @LINE:38
private[this] lazy val controllers_Assets_at10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addData""","""controllers.add.renderAddPage"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addData""","""controllers.add.add"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteData""","""controllers.delete.renderDeletePage"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteData""","""controllers.delete.delete"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchData""","""controllers.search.renderSearchPage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchD/$id<[^/]+>/$value<[^/]+>""","""controllers.search.search(id:String, value:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateData""","""controllers.update.renderUpdatePage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateD/$id<[^/]+>/$value<[^/]+>""","""controllers.search.search(id:String, value:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateData""","""controllers.update.update"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_add_renderAddPage1_route(params) => {
   call { 
        controllers_add_renderAddPage1_invoker.call(controllers.add.renderAddPage)
   }
}
        

// @LINE:11
case controllers_add_add2_route(params) => {
   call { 
        controllers_add_add2_invoker.call(controllers.add.add)
   }
}
        

// @LINE:14
case controllers_delete_renderDeletePage3_route(params) => {
   call { 
        controllers_delete_renderDeletePage3_invoker.call(controllers.delete.renderDeletePage)
   }
}
        

// @LINE:16
case controllers_delete_delete4_route(params) => {
   call { 
        controllers_delete_delete4_invoker.call(controllers.delete.delete)
   }
}
        

// @LINE:20
case controllers_search_renderSearchPage5_route(params) => {
   call { 
        controllers_search_renderSearchPage5_invoker.call(controllers.search.renderSearchPage)
   }
}
        

// @LINE:22
case controllers_search_search6_route(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[String]("value", None)) { (id, value) =>
        controllers_search_search6_invoker.call(controllers.search.search(id, value))
   }
}
        

// @LINE:26
case controllers_update_renderUpdatePage7_route(params) => {
   call { 
        controllers_update_renderUpdatePage7_invoker.call(controllers.update.renderUpdatePage)
   }
}
        

// @LINE:28
case controllers_search_search8_route(params) => {
   call(params.fromPath[String]("id", None), params.fromPath[String]("value", None)) { (id, value) =>
        controllers_search_search8_invoker.call(controllers.search.search(id, value))
   }
}
        

// @LINE:30
case controllers_update_update9_route(params) => {
   call { 
        controllers_update_update9_invoker.call(controllers.update.update)
   }
}
        

// @LINE:38
case controllers_Assets_at10_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     