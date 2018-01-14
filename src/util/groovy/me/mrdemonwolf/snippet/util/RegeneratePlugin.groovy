package me.mrdemonwolf.snippet.util

import me.mrdemonwolf.snippet.util.vscode.SnippetGenerator

class RegeneratePlugin {
    static void main(String[] args) {
        SnippetGenerator.main()
        PackageJsonGenerator.main()
    }
}
