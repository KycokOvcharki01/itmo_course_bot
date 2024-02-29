require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        intent!: /hello
        a: ну здравствуй
        
    state: /weather
        intent!: /weather
        a: На улице холодно
        
    state: /currency
        intent!: /currency
        a: Доллар дорогой

    state: Bye
        intent!: /пока
        a: Пока пока
        
    state: /NoMatch
        intent!: /NoMatch
        a: Я не понял. Вы сказали

    state: Match
        event!: match
        a: {{$context.intent.answer}}