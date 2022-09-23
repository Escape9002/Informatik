class queue ():
    #pointer = -1
    #array = []

    def __init__(self) -> None:
        self.array = []
        self.pointer = -1
          
    
    def enqueue(self, wert): 
        self.pointer += 1
        self.array[self.pointer] = wert