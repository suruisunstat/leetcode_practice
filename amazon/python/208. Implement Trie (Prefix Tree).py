# import collections 

class Node(object):
    def __init__(self):
        self.children = collections.defaultdict(Node)
        self.isword = False
    
    def containsKey(self,ch):
        if self.children.get(ch) == None:
            return False
        return True
    
    def get(self,ch):
        return self.children.get(ch)
    
    def put(self, ch, node):
        self.children[ch] = node
    
    def setEnd(self):
        self.isword = True
        
    def isEnd(self):
        return self.isword
            

class Trie(object):
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = Node()
        

    def insert(self, word): # apple
        """
        Inserts a word into the trie.
        :type word: str
        :rtype: None
        """
        current = self.root
        for ch in word:
            if not current.containsKey(ch):
                current.put(ch, Node())
            current = current.children[ch]
        current.setEnd()
        
        

    def search(self, word):
        """
        Returns if the word is in the trie.
        :type word: str
        :rtype: bool
        """
        current = self.root
        for w in word:
            current = current.children.get(w)
            if current == None:
                return False
        return current.isword
        

    def startsWith(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        :type prefix: str
        :rtype: bool
        """
        current = self.root
        for w in prefix:
            current = current.children.get(w)
            if current == None:
                return False
        return True

## Time: o(m) m is the length of word 
## Space: o(m) m is the size of the trie, otherwise o(1)
    
    
# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)


"""
    def searchLongestPrefix(word):
        current = self.root
        prefix = ""
        for w in word:
            if current.children.get(w) == None:
                return prefix
            elif current.isword = True: # need more examination 
                prefix = prefix + w
                return prefix
            current = current.children.get(w)
            prefix = prefix + w
        return prefix 
        
    def longestCommonPrefix(q, strs):
        if strs == []:
            return ""
        if len(strs) == 1:
            return strs[0]
        trie = Trie()
        for s in strs:
            trie.insert(s)
        return trie.searchLongestPrefix(q)
"""
