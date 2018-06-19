package de.feamer.extensions

fun String.isEmail(): Boolean = this.matches(kotlin.text.Regex("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"))