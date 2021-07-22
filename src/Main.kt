/*
Inline Function
 - 함수가 호출되어 사용되는 것이 아닌
  Code 가 함수 위치에 복사되어 수행되는 함수를 Inline 함수라고 합니다.
 - Kotlin Code 가 Java Code 로 변경될 때 함수를 호출하는 Code 를 함수 내에 구현한 Code 로 변경하는 함수입니다.
 - 함수 호출 방식은 전체 Code의 양이 줄어들어 Memory 를 적게 사용한다는 장점이 있지만
  호출 시 Code 흐름이 이동하고 다시 돌아와야 하기 때문에 작업량이 늘어난다는 단점이 있습니다.
 - 인라인 함수는 전체 Code 의 양이 늘어 Memory 를 더 많이 사용하지만
  코드 흐름의 이동 없이 수행되기 때문에 작업량이 늘어나지 않습니다.
 */
fun main() {
    testFunc1()
    testFunc1()

    /*
    Decompile 하여 Java Code 를 보면
    testFunc2 (Inline Function) 함수 몸통부가
    main Method 로 옮겨와 있는 것을 확일 할 수 있습니다.
     */
    testFunc2()
    testFunc2()
}

fun testFunc1 () {
    println("---------------")
    println("testFunc1")
    println("---------------")
}

inline fun testFunc2 () {
    println("---------------")
    println("testFunc2")
    println("---------------")
}