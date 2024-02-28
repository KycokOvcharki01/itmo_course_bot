require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello
        a: Привет привет
        
    state: Weather
        intent!: /weather
        a: На улице холодно
        
    state: Currency
        intent!: /currency
        a: Доллар дорогой

    state: Bye
        intent!: /пока
        a: Пока пока
        
    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали

    state: Match
        event!: match
        a: {{$context.intent.answer}}