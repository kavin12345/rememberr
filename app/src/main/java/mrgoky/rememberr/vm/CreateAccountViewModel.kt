package mrgoky.rememberr.vm

import rx.subjects.PublishSubject

class CreateAccountViewModel() {

    // Input
    val validateEmailSubscriber = PublishSubject.create<String>()

    // Output
    val emailErrorInputObservable = PublishSubject.create<Boolean>()

    init {
        validateEmailSubscriber.subscribe { email ->
            if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailErrorInputObservable.onNext(true)
            }
        }
    }
}
