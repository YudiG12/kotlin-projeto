import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.create()
        .enableStaticFiles("/views")
        .start(7000)
    app.get("/") {
        ctx -> ctx.redirect("index.html")
    }
}