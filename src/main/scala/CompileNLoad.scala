import java.io.PrintWriter

import dotty.tools.dotc.core.Contexts.ContextBase
import dotty.tools.dotc.core.Contexts.Context

/**
  * Created by dcr on 26/06/17.
  */
object CompileNLoad {

  import dotty.tools.dotc.repl
  import dotty.tools.dotc.repl.REPL

  lazy val config = new REPL.Config
  
  lazy implicit val ictx:Context = (new ContextBase).initialCtx
  lazy val compiler = new repl.CompilingInterpreter(new PrintWriter(System.out), ictx, None)
  
  def test():Unit =  {
    compiler.interpret("""println("coucou")""")
  }
  
}
