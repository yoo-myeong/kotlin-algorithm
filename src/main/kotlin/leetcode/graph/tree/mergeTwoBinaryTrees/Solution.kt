package leetcode.graph.tree.mergeTwoBinaryTrees

import leetcode.graph.tree.TreeNode

class Solution {
    fun mergeTrees(
        root1: TreeNode?,
        root2: TreeNode?,
    ): TreeNode? {
        if (root1 == null) return root2
        if (root2 == null) return root1

        val node = TreeNode(root1.`val` + root2.`val`)

        node.left = mergeTrees(root1.left, root2.left)
        node.right = mergeTrees(root1.right, root2.right)

        return node
    }
}
