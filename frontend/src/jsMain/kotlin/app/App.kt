package app

import dev.fritz2.core.render
import kotlin.js.Date

val SHADOWS = mutableListOf(
    "shadow-2xl",
    "shadow-xl",
    "shadow-lg",
    "shadow-md",
    "shadow",
    "shadow-sm",
    "shadow-none",
    "shadow-inner"
)

fun MutableList<String>.rotate(): MutableList<String> = apply { this.add(removeFirst()) }

fun main() {
    render {
        // card
        div("max-w-full mx-auto flex flex-col items-center md:block sm:px-6 lg:px-8 py-12") {
            section("relative") {
                div("absolute top-24 z-50 shadow-inner w-11/12 left-3 md:left-5") {
                    h1("font-mono text-3xl md:text-4xl font-bold shadow-2xl text-white") { +"Violabs Software" }
                }
                div("flex space-x-2 opacity-80 animate-pulse ") {
                    div {
                        SHADOWS.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate1 = SHADOWS.rotate()

                    div {
                        rotate1.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate2 = rotate1.rotate()

                    div {
                        rotate2.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate3 = rotate2.rotate()

                    div {
                        rotate3.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate4 = rotate3.rotate()

                    div {
                        rotate4.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate5 = rotate4.rotate()

                    div {
                        rotate5.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate6 = rotate5.rotate()

                    div {
                        rotate6.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }

                    val rotate7 = rotate6.rotate()

                    div {
                        rotate7.forEach {
                            div("$it md:w-12 md:h-12 w-8 h-8 mb-2 bg-teal-500") { }
                        }
                    }
                }
            }

            // this is suppose to be a joke
            div("relative text-center sm:flex") {
                div("md:absolute md:-top-[310px] md:right-52 sm:flex") {
                    val now = Date.now()

                    val words = when {
                        now % 9.0 == 0.0 -> "(UM)DENKEN"
                        now % 8.0 == 0.0 -> "(RE)PENSAR"
                        now % 7.0 == 0.0 -> "(RE)PENSER"
                        now % 6.0 == 0.0 -> "(RE)PENSARE"
                        now % 5.0 == 0.0 -> "(GN)IKNIHTER"
                        now % 4.0 == 0.0 -> "(Пе)реосмислення"
                        now % 3.0 == 0.0 -> "(Επ)ανεξέταση"
                        else -> "(RE)THINKING"
                    }

                    section("flex flex-col justify-center") {
                        div("text-3xl text-teal-300 tracking-wider") { +words }
                        div("text-2xl text-teal-400 tracking-wider") { +words }
                        div("text-xl text-teal-500 tracking-wider") { +words }
                        div("text-lg text-teal-600 tracking-normal") { +words }
                        div("text-md text-teal-700 tracking-tight") { +words }
                        div("text-sm text-teal-800 tracking-tighter") { +words }
                        div("text-xs text-teal-900 tracking-tighter") { +words }
                        div("text-[10px] text-teal-900 tracking-tighter opacity-50") { +words }
                        div("text-[8px] text-teal-900 tracking-tighter opacity-30") { +words }
                        div("text-[6px] text-teal-900 tracking-tighter opacity-20") { +words }
                    }

                }
            }
        }

        if (Date.now() % 144.0 == 0.0) {
            div("h-96 w-full tile-bg opacity-50 text-2xl text-pink-900 font-bold text-center") {
                div("bg-teal-900 opacity-80") { +"I am. Therefore I Think.".uppercase() }
            }
        }
    }
}