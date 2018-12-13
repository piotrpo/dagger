package pl.com.digita.example.di

class DaggerApplicationFactory {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val application = DaggerApplicationComponent.builder()
                    .companion(DependencyFactories.Companion)
                    .build()
                    .makeApplication()
        }
    }
}

