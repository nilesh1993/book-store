/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package temp

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$next_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      $_scalate_$_context << ( "<span>\n  Trial Overview\n</span>\n" );
    }
  }
}


class $_scalate_$next_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$next_jade.$_scalate_$render(context)
}
