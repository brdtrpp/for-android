package chat.stoat.ndk

import chat.stoat.BuildConfig

annotation class NativeLibrary(val name: String) {
    companion object {
        const val LIB_NAME_NATIVE_MARKDOWN = "stendal"
        const val LIB_NAME_NATIVE_MARKDOWN_V2 = "finalmarkdown"
    }
}

object NativeLibraries {
    fun init() {
        System.loadLibrary(NativeLibrary.LIB_NAME_NATIVE_MARKDOWN)
        Stendal.init()
        // finalmarkdown has no native source yet — skip loading
    }
}
