class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        row_1 = "QWERTYUIOP"
        row_1 = row_1 + row_1.lower()
        row_2 = "ASDFGHJKL"
        row_2 = row_2 + row_2.lower()
        row_3 = "ZXCVBNM"
        row_3 = row_3 + row_3.lower()
        res = []
        for word in words:
            flag1 = True
            flag2 = True
            flag3 = True
            for letter in word:
                if letter not in row_1:
                    flag1 = False
                if letter not in row_2:
                    flag2 = False
                if letter not in row_3:
                    flag3 = False
            if flag1 or flag2 or flag3:
                res.append(word)
        return res