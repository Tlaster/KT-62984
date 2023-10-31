package moe.tlaster.KT62984

import androidx.compose.runtime.Composable
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class Test {
    @Composable
    fun SomeComposeFunction() { } // will have compiler error
    @Composable
    protected fun SomeProtectedComposeFunction() { } // also have compiler error

    @Composable
    internal fun SomeInternalComposeFunction() { } // this works without any error
    @Composable
    private fun SomePrivateComposeFunction() { } // this also works without any error
}