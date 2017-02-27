package lice.compiler

import lice.compiler.model.ExpressionNode
import lice.compiler.model.ValueNode
import lice.compiler.util.SymbolList
import lice.compiler.util.println
import org.junit.Test

/**
 * Created by ice1000 on 2017/2/21.
 *
 * @author ice1000
 */
class FeatureTest {
	@Test(timeout = 1000)
	fun testHandWrittenAst() {
		val sl = SymbolList()
		val a = ValueNode(1, 1)
		val b = ValueNode(1, 1)
		val ast = ExpressionNode(sl, "+", 1, listOf(a, b))
		ast
				.eval()
				.o
				.println()
	}
}