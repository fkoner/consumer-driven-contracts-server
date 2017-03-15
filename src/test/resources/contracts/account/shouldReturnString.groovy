package contracts.account

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url value(consumer(regex('/account/saludo/hello')), producer('/account/saludo/hello'))
    }

    response {
        status 200
        body('Hello')
        headers {
            header('Content-Type': value(
                    producer('application/json;charset=UTF-8'),
                    consumer('text/plain')
            ))
        }
    }

}
