# Android BottomSheet 底部面板演示

## 简介

本 Demo 演示 Android 中 BottomSheet 的两种类型：Modal BottomSheet 和 Persistent BottomSheet。

## 基本原理

### 什么是 BottomSheet？

BottomSheet 是 Material Design 组件，从屏幕底部滑出的面板，用于展示额外的内容或操作。

### 类型

1. **Modal BottomSheet**: 模态对话框，阻塞其他交互
2. **Persistent BottomSheet**: 作为布局一部分，可折叠/展开

## 启动和使用

### 环境要求
- Android Studio
- Material Components 库

### 安装运行
使用 Android Studio 打开项目并运行

## 教程

### Modal BottomSheet

```kotlin
val bottomSheet = BottomSheetDialog(this)
val view = layoutInflater.inflate(R.layout.bottom_sheet_content, null)
bottomSheet.setContentView(view)
bottomSheet.show()
```

### 关键点

1. 使用 BottomSheetDialog 创建模态面板
2. 通过 layoutInflater 加载自定义布局
3. 调用 show() 显示面板

## 注意事项

1. BottomSheet 默认有peek高度
2. 可以设置 BottomSheetBehavior 自定义行为
3. 注意处理返回键关闭面板
