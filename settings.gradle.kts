rootProject.name = "cleanarchitecturetemplate"
include("domain")
include("usecases")
include("config")
include("adapter:web:controller")
findProject(":adapter:web:controller")?.name = "controller"
include("adapter:db:sql")
findProject(":adapter:db:sql")?.name = "sql"
include("spring")
include("application:spring")
findProject(":application:spring")?.name = "spring"
include("adapter")
