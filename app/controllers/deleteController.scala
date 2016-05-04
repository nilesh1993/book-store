package controllers

import play.api.mvc.{Controller, Action}

/**
 * Created by njm1688 on 4/28/16.
 */
class deleteController(renderer: JadeRenderer) extends Controller{

  def delete() = Action {

    request => {

//      val BookId: Seq[String] = request.body.asFormUrlEncoded.get("BookId")
//      val dropdownValue: Seq[String] = request.body.asFormUrlEncoded.get("mydropdown")
      var list = collection.mutable.ListBuffer("")
      println("in delete controller")
      request.body.asJson.map { json =>
        (json \ "BookId").asOpt[String].map { BookId =>
          list += BookId
        }
      }
      request.body.asJson.map { json =>
        (json \ "mydropdown").asOpt[String].map { mydropdown =>
          list += mydropdown
        }
      }
      println(list(1),list(2))
      val deleteService = new DeleteServiceController()
      deleteService.delete(list(1),list(2))

      Ok(request.body.asJson.get)


    }
  }

    def renderDeletePage()=Action{

      Ok(renderer.render("deleteData"))
    }

}
