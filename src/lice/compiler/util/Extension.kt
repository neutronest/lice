/**
 * Created by ice1000 on 2017/2/16.
 *
 * @author ice1000
 */
package lice.compiler.util

@JvmField
var DEBUGGING = true

@JvmField
var VERBOSE = true

fun <T> T.println(): T {
	println(this)
	return this
}

fun <T> T.debugOutput(): T {
	if (DEBUGGING) println(this)
	return this
}

inline fun <T> T.debugApply(block: T.() -> Unit): T {
	if (DEBUGGING) this.block()
	return this
}

inline fun debug(block: () -> Unit) {
	if (DEBUGGING) block()
}

inline fun verbose(block: () -> Unit) {
	if (VERBOSE) block()
}

fun <T> T.verboseOutput(): T {
	if (VERBOSE) println(this)
	return this
}

fun serr(str: String) = System.err.println(str)

fun sout(str: String) = println(str)

fun <A, B, C> ((a: A, b: B) -> C).curry() =
		{ a: A ->
			{ b: B ->
				invoke(a, b)
			}
		}

fun <A, B, C, D> ((a: A, b: B, c: C) -> D).curry() =
		{ a: A ->
			{ b: B ->
				{ c: C ->
					invoke(a, b, c)
				}
			}
		}

fun <A, B, C, D, E> ((a: A, b: B, c: C, d: D) -> E).curry() =
		{ a: A ->
			{ b: B ->
				{ c: C ->
					{ d: D ->
						invoke(a, b, c, d)
					}
				}
			}
		}
