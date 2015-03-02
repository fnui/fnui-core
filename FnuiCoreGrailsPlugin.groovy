class FnuiCoreGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.4 > *"

    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def title = "FnUI Core Plugin"
    def author = "Florian Freudenberg"
    def authorEmail = "flo@freudenberg.berlin"
    def description = '''\
This plugin provides basic interfaces needed by plugins which provides (optional) support
for FnUI toolchain users without embedding the toolchain into the plugin.
'''

    def documentation = "https://github.com/fnui/fnui-core"

    def license = "APACHE"

    def scm = [ url: "https://github.com/fnui/fnui-core" ]
}
